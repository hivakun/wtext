package br.com.daydream.wtext.module.list;

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


import br.com.daydream.wtext.arq.module.Text;
import org.jetbrains.annotations.NotNull;

/**
 * Represents an item at a list element at the document.
 *
 * @author hivakun
 * Created on 30/04/16
 */
public class ListItem extends Text {

    protected int level;

    /**
     *
     * @param level
     * @param item
     */
    public ListItem(int level, String item) {
        super(item);
        this.level = (level > 0) ? level : 1;
    }

    /**
     * Cre
     * @param level
     * @param item
     */
    public ListItem(int level, @NotNull Text item) {
        super(item.toString());
        this.level = (level > 0) ? level : 1;
    }

    /**
     * Get the item level at the list hierarchy.
     *
     * @return the item level at the list hierarchy
     */
    public int getLevel() {
        return level;
    }
}
