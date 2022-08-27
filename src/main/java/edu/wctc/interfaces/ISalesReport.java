package edu.wctc.interfaces;

import edu.wctc.salesfigures.Sale;

import java.util.List;

public interface ISalesReport {
    void generateReport(List<ISale> salesList);
}
