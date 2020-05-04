PR = "r0"
FILESEXTRAPATHS_prepend := "${THISDIR}/config:"

SRC_URI_append_achilles += " \
	file://socfpga-5.4.23-lts/cfg/usb-gadget.cfg \
	file://socfpga-5.4.23-lts/patches/0001-add-achilles-devicetree.patch \
	"

COMPATIBLE_MACHINE = "achilles"
