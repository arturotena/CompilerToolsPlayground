/*
 * Copyright (c) 2014, Arturo Tena <http://arturotena.com>
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */
package com.arturotena.compilertoolsplayground.test1;

import javax.lang.model.SourceVersion;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

/**
 * Print the class name of the javax.tools.JavaCompiler and the source versions
 * supported.
 *
 * @author Arturo Tena <http://arturotena.com>
 */
public class Main {

    public static void main(String... args) {
        final JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        System.out.println(compiler.getClass().getName());
        for (final SourceVersion ver : compiler.getSourceVersions()) {
            System.out.println(ver);
        }

        /*
         It should print something like:
         com.sun.tools.javac.api.JavacTool
         RELEASE_3
         RELEASE_4
         RELEASE_5
         RELEASE_6
         RELEASE_7
         RELEASE_8
         */
    }
}
