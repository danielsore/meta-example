FILESEXTRAPATHS_prepend := "${THISDIR}/linux-toradex_4.9-2.3.x:"

SRC_URI += "\
        file://imx6dl-colibri-example.dts \
        file://defconfig \
        "

KERNEL_DEVICETREE_append = " imx6dl-colibri-example.dtb"

do_configure_append() {
    cp ${WORKDIR}/*.dts ${WORKDIR}/git/arch/${ARCH}/boot/dts/
}