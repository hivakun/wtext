package br.com.daydream;

/*
 * #%L
 * WText
 * %%
 * Copyright (C) 2016 Daydream
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */


import br.com.daydream.wtext.WikiPage;
import br.com.daydream.wtext.module.paragraph.Paragraph;
import br.com.daydream.wtext.module.paragraph.ParagraphBuilder;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try(WikiPage page = WikiPage.newWikiPage(new FileOutputStream("teste.txt"))) {

            ParagraphBuilder builder = new ParagraphBuilder();
            builder.append("Esse é um titulo");

            Paragraph section = builder.buildSection();

            page.addElement(section);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } ;
    }
}
