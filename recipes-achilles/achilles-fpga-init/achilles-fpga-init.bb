SUMMARY = "REFLEX CES Achilles SOM FPGA Initialization"
DESCRIPTION = "Scripts to initialize the FPGA and its peripherals using devicetree overlays."
AUTHOR = "Dan Negvesky <dnegvesky@reflexces.com>"
SECTION = "achilles"

PR = "r1"

inherit systemd

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

PACKAGE_ARCH = "${MACHINE_ARCH}"
PV = "1.0${PR}"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI = "file://achilles-fpga-init.service \
           file://achilles-fpga-init.sh \
          "

do_install() {
	install -d ${D}${base_libdir}/systemd/system
	install -m 0644 ${WORKDIR}/*.service ${D}${base_libdir}/systemd/system

	install -d ${D}${bindir}
	install -m 0755 ${WORKDIR}/*.sh ${D}${bindir}
}

ALLOW_EMPTY_${PN} = "1"

FILES_${PN}-network = "${base_libdir}/systemd/system/achilles-fpga-init.service \
                       ${bindir}/achilles-fpga-init.sh"


NATIVE_SYSTEMD_SUPPORT = "1"
SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE_${PN} = "achilles-fpga-init.service"
