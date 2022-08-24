package com.solvd.onlineshop.enums;

import java.util.HashMap;
import java.util.Map;

public enum MainDepartments {
    NEWYORK(35),
    WASHINGTON(41),
    ONTARIO(11),
    LONDON(14),
    KYIV(54),
    WARSHAVA(38),
    PARIS(22);
    private static final Map<Integer, MainDepartments> employees_quantity = new HashMap<Integer, MainDepartments>();

    static {
        for (MainDepartments e : values()) {
            employees_quantity.put(e.employeesQuantity, e);
        }
    }

    public final int employeesQuantity;

    private MainDepartments(int employeesQuantity) {
        this.employeesQuantity = employeesQuantity;
    }

    public static MainDepartments valueOfEmployeesQuantity(int employeesQuantity) {
        return employees_quantity.get(employeesQuantity);
    }
}
