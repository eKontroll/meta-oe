SUMMARY = "A Modbus library"
DESCRIPTION = "libmodbus is a C library designed to provide a fast and robust \
implementation of the Modbus protocol. It runs on Linux, Mac OS X, FreeBSD, \
QNX and Windows. Including eKontroll patches."
HOMEPAGE = "http://www.libmodbus.org/"
SECTION = "libs"

PV = "3.1.1+git${SRCPV}"
PR = "r0"

LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/COPYING.LESSER;md5=4fbd65380cdd255951079008b364516c"

SRC_URI = "git://github.com/eKontroll/libmodbus.git;branch=ekontroll;protocol=git"
SRCREV = "8ea07b61997521bd30a2ceb537aa6438c1dedbc1"
S = "${WORKDIR}/git"

inherit autotools pkgconfig
