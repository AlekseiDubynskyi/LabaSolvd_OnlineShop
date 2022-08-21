package com.solvd.onlineshop.enums;

public enum StarReview {
    ONE_STAR {
        @Override
        public int getValue() {
            return 1;
        }
    },
    TWO_STARS {
        @Override
        public int getValue() {
            return 2;
        }
    },
    THREE_STARS {
        @Override
        public int getValue() {
            return 3;
        }
    },
    FOUR_STARS {
        @Override
        public int getValue() {
            return 4;
        }
    },
    FIVE_STARS {
        @Override
        public int getValue() {
            return 5;
        }
    };

    public abstract int getValue();

}
