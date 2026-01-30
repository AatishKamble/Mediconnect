package com.edutech.progressive.service.impl;

import java.util.Collections;
import java.util.List;

import com.edutech.progressive.dao.DoctorDAO;
import com.edutech.progressive.entity.Doctor;
import com.edutech.progressive.service.DoctorService;

public class DoctorServiceImplJdbc  implements DoctorService{

      DoctorDAO doctorDAO;

    

    public DoctorServiceImplJdbc(DoctorDAO doctorDAO) {
        this.doctorDAO = doctorDAO;
    }

    @Override
    public List<Doctor> getAllDoctors() {
       List<Doctor> doctors=null;
        try {
            doctors= doctorDAO.getAllDoctors();
        } catch (Exception e) {
           e.printStackTrace();
        }
     
        return doctors;
    }

    @Override
    public Integer addDoctor(Doctor doctor) {
         try {
             return doctorDAO.addDoctor(doctor);
        } catch (Exception e) {
           e.printStackTrace();
        }
        return -1;
    }

    @Override
    public List<Doctor> getDoctorSortedByExperience() {
        List<Doctor> doctors=null;
        try {
            doctors= doctorDAO.getAllDoctors();
             Collections.sort(doctors);
            
        } catch (Exception e) {
           e.printStackTrace();
        }
     
        return doctors;
        
    }

}