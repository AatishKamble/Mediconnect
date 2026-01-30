package com.edutech.progressive.service.impl;


import java.util.List;

import com.edutech.progressive.dao.ClinicDAO;
import com.edutech.progressive.entity.Clinic;
import com.edutech.progressive.service.ClinicService;

public class ClinicServiceImplJdbc implements ClinicService {


     ClinicDAO clinicDAO;

    

    public ClinicServiceImplJdbc( ClinicDAO clinicDAO) {
        this.clinicDAO = clinicDAO;
    }

    @Override
    public List<Clinic> getAllClinics() {
       List<Clinic> clinics=null;
        try {
            clinics= clinicDAO.getAllClinics();
        } catch (Exception e) {
           e.printStackTrace();
        }
     
        return clinics;
    }

    @Override
    public Clinic getClinicById(int clinicId) {
       try {
             return  clinicDAO.getClinicById(clinicId);
        } catch (Exception e) {
           e.printStackTrace();
        }
      return null;
    }

    @Override
    public Integer addClinic(Clinic clinic) {
       try {
             return clinicDAO.addClinic(clinic);
        } catch (Exception e) {
           e.printStackTrace();
        }
        return -1;
    }

    @Override
    public void updateClinic(Clinic clinic) {
       try {
            clinicDAO.updateClinic(clinic);
        } catch (Exception e) {
           e.printStackTrace();
        }
       
    }

    @Override
    public void deleteClinic(int clinicId) {
         try {
            clinicDAO.deleteClinic(clinicId);
        } catch (Exception e) {
           e.printStackTrace();
        }
    }

}