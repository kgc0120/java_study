package me.bumblebee.demo.week11_enum;

public enum DayEnum {
    MONDAY("월"),
    TUESDAY("화"),
    WEDNESDAY("수"),
    THURSDAY("목"),
    FRIDAY("금"),
    SATURDAY("토"),
    SUNDAY("일");

    private String kr;

    DayEnum(String kr) {
        System.out.println(kr);
        this.kr = kr;
    }

    public String printDatKr() {
        return this.kr;
    }
}
