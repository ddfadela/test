package com.example.demandeur.controller;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.example.demandeur.Export.ExportPdf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.lowagie.text.DocumentException;

import com.example.demandeur.entity.Cv;
import com.example.demandeur.entity.Demandeur;
import com.example.demandeur.repo.CvRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("api2")

public class CvController {
    @Autowired
    CvRepo CvRepo;
        @RequestMapping(value = "/ajouterCv", method = RequestMethod.POST)
    public Cv createNewCv(@RequestBody Cv Cv) {
        return CvRepo.save(Cv);
    }

        @PutMapping("/cv/{id}")  //Put http://localhost:8081/api/cv/1
        public Cv updateCv(@PathVariable(value = "id") Long idCv,
                @RequestBody Cv Cv) {
            if (CvRepo.findById(idCv).isPresent()) {
                Cv.setIdCv(idCv);
                return CvRepo.save(Cv);
            }
            return null;
        }




   // @GetMapping(value = "/{id}/exportpdf", produces = MediaType.APPLICATION_PDF_VALUE)
    //public ResponseEntity<InputStreamResource> employeeReports(HttpServletResponse response) throws IOException {

      //  List<Cv> allEmployees = CvRepo.findAll();

    //    ByteArrayInputStream bis = ExportPdf.CvReport(allEmployees);
    //    HttpHeaders headers = new HttpHeaders();

     //   headers.add("Content-Disposition", "attachment;filename=Cv.pdf");

     //   return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF)
        //        .body(new InputStreamResource(bis));
    //}

}
