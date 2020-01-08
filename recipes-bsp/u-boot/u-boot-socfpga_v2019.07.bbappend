PR = "r1"

FILESEXTRAPATHS_prepend := "${THISDIR}/files/v2019.07:"

#DEPENDS += "u-boot-mkimage-native"

# this is an older SRCREV used by the REFLEX factory u-boot build
#SRCREV_achilles = "ab2181dd766157a74b309d12e0b61c4f3cdc8564"
#SRC_URI_achilles = "git://github.com/altera-opensource/u-boot-socfpga.git;branch=socfpga_v2019.07;prot=https"

#SRCREV_FORMAT = "achilles"
#SRCREV_achilles = "${AUTOREV}"

SRC_URI_append = "\
	file://0001-add-socfpga_arria10_rxc_defconfig.patch \
	"
