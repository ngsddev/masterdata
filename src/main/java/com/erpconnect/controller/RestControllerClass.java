package com.erpconnect.controller;

import com.erpconnect.model.BankEntity;
import com.erpconnect.model.BranchByCityRequestModel;
import com.erpconnect.model.BranchEntity;
import com.erpconnect.model.CityEntity;
import com.erpconnect.repository.BankRepository;
import com.erpconnect.repository.BranchRepository;
import com.erpconnect.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/masterdata/v1")
public class RestControllerClass {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();

    @Autowired
    private BankRepository bankRepository;

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private BranchRepository branchRepository;

    @GetMapping("/hello")
    public String Hello() {
        return "Master data";
    }

    @GetMapping("/bank/insertbank")
    public String InsertBank (@RequestParam String bank_id, String bank_name) {
        BankEntity bankEntity = new BankEntity();

        bankEntity.setBank_id(bank_id);
        bankEntity.setBank_name(bank_name);
        bankRepository.save(bankEntity);

        return "New Bank Inserted";
    }

    @GetMapping("/city/insertcity")
    public String InsertCity (@RequestParam String city_id, String city_name){
        CityEntity cityEntity = new CityEntity();

        cityEntity.setCity_id(city_id);
        cityEntity.setCity_name(city_name);
        cityRepository.save(cityEntity);

        return "New city inserted.";
    }

    @GetMapping("/branch/insertbranch")
    public String InsertBranch (@RequestParam String branch_name, String branch_code, String city_id, String bank_id){
        BranchEntity branchEntity = new BranchEntity();
        //branchEntity.setBranchName(branch_name);
        branchEntity.setBranchCode(branch_code);
        //branchEntity.setCityId(city_id);
        branchEntity.setBank_id(bank_id);
        branchRepository.save(branchEntity);
        return "New branch inserted.";
    }

    @GetMapping("/bank/getbank")
    public List<BankEntity> GetAllBank(){
        List<BankEntity> listBank = bankRepository.findAll();
        return listBank;
    }

    @GetMapping("/city/getcity")
    public List<CityEntity> GetAllCity(){
        List<CityEntity> listCity = cityRepository.findAll();
        return listCity;
    }

    @PostMapping("/branch/branch-by-city")
    public List<BranchEntity> GetBranchByCity(@RequestBody BranchByCityRequestModel branchByCityRequestModel){
        List<BranchEntity> listBranch = new ArrayList<>();
        BranchEntity branchEntity = new BranchEntity();
        branchEntity.setBranch_id(1);
        branchEntity.setBranch_name("Chi nhánh");
        branchEntity.setBank_id(branchByCityRequestModel.getBank_id());
        branchEntity.setCity_id(branchByCityRequestModel.getCity_id());
        branchEntity.setBranchCode(branchByCityRequestModel.getBank_id()+"CHINHANH"+branchByCityRequestModel.getCity_id());

        listBranch.add(branchEntity);

        return listBranch;
    }

}
