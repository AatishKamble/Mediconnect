package com.edutech.progressive;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

import com.edutech.progressive.config.DatabaseConnectionManager;
import com.edutech.progressive.dao.PatientDAOImpl;
import com.edutech.progressive.entity.Patient;
import com.edutech.progressive.service.impl.PatientServiceImplJdbc;

public class MediConnectApplication {
    public static void main(String[] args) throws SQLException,IOException,FileNotFoundException,Exception {
        PatientServiceImplJdbc p =new PatientServiceImplJdbc(new PatientDAOImpl());

        p.deletePatient(1);
       System.out.println(p.getPatientById(1));

      
    }
}
