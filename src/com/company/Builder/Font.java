package com.company.Builder;

public class Font {
    private final String family;
    private final double size;
    private final String serif;
    private final String cursive;

    public static class FontMaker {
        private String family = "";
        private double size;
        private String serif = "";
        private String cursive = "";

        public FontMaker(String family) {
            this.family = family;
        }

        public FontMaker size(double size) {
            this.size = size;
            return this;
        }

        public FontMaker serif (String serif ) {
            this.serif = serif ;
            return this;
        }

        public FontMaker cursive(String cursive) {
            this.cursive = cursive;
            return this;
        }

        public Font makeFont() {
            return new Font(this);
        }
    }

    private Font(FontMaker type) {
        family = type.family;
        size = type.size;
        serif = type.serif;
        cursive = type.cursive;
    }

    @Override
    public String toString() {
        return "Font description: Size - "+ size +", scribble - "+ serif +", cursive - "+ cursive;
    }
}
