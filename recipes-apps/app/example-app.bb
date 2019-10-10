SUMMARY  =  "A small hello world application"

LICENSE = "CLOSED"

SRC_URI += "file://helloworld.c \
            file://helloworld.service \
            "

inherit systemd

do_compile() {
    ${CC} ${WORKDIR}/helloworld.c -o ${WORKDIR}/helloworld
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/helloworld ${D}${bindir}

    install -d ${D}${systemd_unitdir}/system/
    install -m 0644 ${WORKDIR}/helloworld.service ${D}${systemd_unitdir}/system
}

FILES_${PN} += "/home/root"
FILES_${PN} += "/lib/systemd/system"

SYSTEMD_SERVICE_${PN} = "helloworld.service"
SYSTEMD_AUTO_ENABLE ??= "enable"

