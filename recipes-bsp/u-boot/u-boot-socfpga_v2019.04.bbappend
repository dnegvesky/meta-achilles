PR = "r1"

FILESEXTRAPATHS_prepend := "${THISDIR}/files/v2019.04:"

SRC_URI = "git://github.com/altera-opensource/u-boot-socfpga.git;branch=socfpga_v2019.04"
SRCREV = "04b3af7f9272316c88ae63618f72f2b535c31837"

SRC_URI_append = "\
	file://0001-add-achilles-support-for-u-boot-socfpga-v2019.04.patch \
	"
