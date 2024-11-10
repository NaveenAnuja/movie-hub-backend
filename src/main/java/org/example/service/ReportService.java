package org.example.service;

import org.example.dto.Report;

import java.util.List;

public interface ReportService {

    List<Report> getReport();

    void deleteReport(Integer id);

    void updateReport(Report report);

    Report searchReport(Integer id);
}
