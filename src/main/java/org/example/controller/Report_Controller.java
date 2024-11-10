package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Report;
import org.example.service.ReportService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/report")
@RequiredArgsConstructor
public class Report_Controller {

    private final ReportService service;

    @GetMapping("/view-reports")
    public List<Report> getReport(){
        return service.getReport();
    }

    @DeleteMapping("/delete-report")
    public void deleteReport(@PathVariable Integer id){
        service.deleteReport(id);
    }

    @PutMapping("/update-report")
    public void updateReport(@RequestBody Report report){
        service.updateReport(report);
    }

    @GetMapping("/search-report/{id}")
    public Report searchReport(@PathVariable Integer id){
        return service.searchReport(id);
    }
}
