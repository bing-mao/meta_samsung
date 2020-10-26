require ${COREBASE}/meta/recipes-bsp/u-boot/u-boot.inc

SUMMARY = "U-Boot bootloader for Samsung/Nexell s5pxx18"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=0507cd7da8e7ad6d6701926ec9b84c95"
# u-boot needs devtree compiler to parse dts files
DEPENDS += "dtc-native bc-native"
SRCREV = "${AUTOREV}"

#https://github.com/NexellCorp/u-boot-2016.01
#SRC_URI = "git://github.com/SamsungARTIK/u-boot-artik;protocol=https;branch=ARTIK-SW-18.05.00"
#SRC_URI = "git://github.com/friendlyarm/u-boot.git;protocol=https;branch=nanopi2-v2016.01"
SRC_URI = "git://github.com/bing-mao/nanopi3_u-boot_binary;protocol=https;branch=main"

S = "${WORKDIR}/git"

do_deploy() {
	install -m 0644 ${S}/u-boot-nanopi3-2016.01-r0.bin ${DEPLOYDIR}/
}

do_configure() {
	:
}

do_install() {
	:
}

addtask deploy before do_build after do_compile
