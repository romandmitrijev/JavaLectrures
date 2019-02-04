package com.lectureSecondPart.one.enums;

public enum UserTypes {
    BUSINESS(1),
    REGULAR(2),
    VIP(3);

    private int rate;

    UserTypes(int rate) {
        this.rate = rate;
    }

    int moneyWithRate(int money) {
        return money * rate;
    }

    public static void main(String[] args) {
        UserTypes userTypes = UserTypes.REGULAR;
        System.out.println(userTypes.moneyWithRate(10));

    }

    private static void handleUser(UserTypes userTypes) {
        switch (userTypes) {
            case REGULAR:
                System.out.println("Hello");
                break;
            case VIP:
                System.out.println("Something else");
                break;
                default:
                    System.out.println("Default");
        }
    }
}
