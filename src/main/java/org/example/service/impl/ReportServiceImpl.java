package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Report;
import org.example.entity.ReportEntity;
import org.example.repository.ReportRepository;
import org.example.service.ReportService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReportServiceImpl implements ReportService {

    private final ModelMapper mapper;
    private final ReportRepository repository;
    @Override
    public List<Report> getReport() {
        List<Report>  reportList = new ArrayList<>();
        repository.findAll().forEach(reportEntity -> {
            reportList.add(mapper.map(reportEntity,Report.class));
        });
        return reportList;
    }

    @Override
    public void deleteReport(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void updateReport(Report report) {
        repository.save(mapper.map(report, ReportEntity.class));
    }

    @Override
    public Report searchReport(Integer id) {
        return mapper.map(repository.findById(id),Report.class);
    }
}
