package com.solvd.onlineshop.interfaces;

import com.solvd.onlineshop.shoppingorders.TransactionReports;

@FunctionalInterface
public interface ITransactionSuccess {
    boolean transactionSuccess(TransactionReports transactionReports);
}
