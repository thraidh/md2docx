/*
 * Copyright (C) 2016 Ron Koerner
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.thraidh.md2docx;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.pegdown.Extensions.*;
import org.pegdown.PegDownProcessor;

/**
 * This is not really a test, but used for experimenting.
 *
 * @author Ron Koerner
 */
public class PegdownTest {

    public PegdownTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Main.
     *
     * @throws java.io.IOException
     */
    @Test
    public void testPegdown() throws IOException {
        int options = ABBREVIATIONS | EXTANCHORLINKS
                | ATXHEADERSPACE | AUTOLINKS
                | DEFINITIONS | FENCED_CODE_BLOCKS | SMARTYPANTS | STRIKETHROUGH
                | SUPPRESS_ALL_HTML | TABLES;
        PegDownProcessor pdp = new PegDownProcessor(options);
        String markdownToHtml = pdp.markdownToHtml(new String(Files
                .readAllBytes(Paths.get("src/test/md/test.md")),
                StandardCharsets.UTF_8));
        System.out.println(markdownToHtml);
    }

}
