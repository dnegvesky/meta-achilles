PR = "r1"

FILESEXTRAPATHS_prepend := "${THISDIR}/files/v2019.10:"

SRC_URI = "git://github.com/altera-opensource/u-boot-socfpga.git;branch=socfpga_v2019.10"
SRCREV = "7298985146c70ca8af8d43dd963b3e8aa3900d87"

SRC_URI_append = "\
	file://0001-add-achilles-support-for-u-boot-socfpga-v2019.10.patch \
	"
