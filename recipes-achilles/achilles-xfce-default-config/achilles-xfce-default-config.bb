SUMMARY = "REFLEX CES Achilles SOM X11VNC Startup"
DESCRIPTION = "REFLEX CES Achilles SOM recipe to preset xfce user default configuration"
AUTHOR = "Dan Negvesky <dnegvesky@reflexces.com>"
SECTION = "achilles"

PV = "1.0"
PR = "r0"

inherit allarch

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI = " \
    file://.config \
    file://xfce-reflex20.jpg \
    "

do_install() {
    # default root user configration -> /home/root
    install -d ${D}/home/root
    cp -r ${WORKDIR}/.config ${D}/home/root
    
    # default new user configration -> /etc/skel
    install -d ${D}${sysconfdir}/skel
    cp -r ${WORKDIR}/.config ${D}${sysconfdir}/skel/

    # background
    install -d ${D}${datadir}/backgrounds/xfce
    install -m 0644 ${WORKDIR}/xfce-reflex20.jpg ${D}${datadir}/backgrounds/xfce
}

FILES_${PN} += "${datadir}/backgrounds/xfce /home/root"
