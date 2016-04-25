package br.com.daydream.wtext;

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


import br.com.daydream.wtext.module.Element;

import java.io.*;

/**
 * Created by Rivaldo on 23/04/16.
 */
public class WikiPage implements Closeable {

    private boolean open;
    private BufferedOutputStream os;

    private WikiPage(OutputStream output) {
        this.open = true;
        this.os = new BufferedOutputStream(output);
    }

    public static WikiPage newWikiPage(OutputStream output) {
        return new WikiPage(output);
    }

    public boolean addElement(Element element) {
        try {
            os.write(element.toString().getBytes());
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    public void close() throws IOException {
        if (isOpen()) {
            os.flush();
            os.close();
        }
    }

    public boolean isOpen() {
        return os != null && open;
    }

    public boolean isClose() {
        return os == null || !open;
    }
}
