package br.com.daydream.wtext.arq.formatter;

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


import br.com.daydream.wtext.formatter.WikiTextFormatter;

/**
 * Created by Rivaldo on 23/04/16.
 */
public enum TextFormat {

    BOLD() {
        @Override
        public String apply(String text) {
            return formatter.bold(text);
        }
    },

    ITALIC() {
        @Override
        public String apply(String text) {
            return formatter.italic(text);
        }
    },

    ITALIC_BOLD() {
        @Override
        public String apply(String text) {
            return formatter.italicBold(text);
        }
    },

    SMALLCAPS() {
        @Override
        public String apply(String text) {
            return formatter.smallCaps(text);
        }
    },

    CODE() {
        @Override
        public String apply(String text) {
            return formatter.code(text);
        }
    },

    SMALL() {
        @Override
        public String apply(String text) {
            return formatter.small(text);
        }
    },

    BIG() {
        @Override
        public String apply(String text) {
            return formatter.big(text);
        }
    },

    BLOCKQUOTE() {
        @Override
        public String apply(String text) {
            return formatter.blockQuote(text);
        }
    },

    CENTER() {
        @Override
        public String apply(String text) {
            return formatter.center(text);
        }
    };

    final TextFormatter formatter;

    TextFormat() {
        formatter = new WikiTextFormatter();
    }

    public abstract String apply(String text);
}