PR = "r1"

FILESEXTRAPATHS_prepend := "${THISDIR}/files/v2019.04:"

SRC_URI = "git://github.com/altera-opensource/u-boot-socfpga.git;branch=socfpga_v2019.04"
SRCREV = "04b3af7f9272316c88ae63618f72f2b535c31837"

SRC_URI_append = "\
	file://0001-add-achilles-u-boot-devicetree.patch \
	file://0002-add-achilles-support-to-kconfig.patch \
	file://0003-add-achilles-defconfig-support.patch \
	file://0004-add-support-for-socfpga_arria10_achilles.h.patch \
	file://0005-add-achilles-dts-support-to-arch-arm-dts-Makefile.patch \
	"
