DESCRIPTION = "GNOME Terminal"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949"
DEPENDS = "gtk+ glib-2.0 startup-notification dbus-glib vte"

inherit gnome

SRC_URI[archive.md5sum] = "e6f10df23058c810bf07b330b53e6d0b"
SRC_URI[archive.sha256sum] = "7f41e4b185a2cf65ff417b89e429fc3b625c5e3f042ee1763bda6490fa4676fb"

EXTRA_OECONF += "--disable-scrollkeeper"

# Remove an autogenerated file that needs to be rebuilt
do_configure_prepend () {
    rm -f ${S}/src/terminal-type-builtins.c
    sed -i -e s:help::g ${S}/Makefile.am
}
