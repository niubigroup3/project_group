package com.citi.controller;

import com.citi.bean.DemoBondsSalesRecord;
import com.citi.service.BondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: chenle
 * @Date: 2020/8/24 - 22:47
 * @Description: com.citi.controller
 * @version: 1.0
 */
@Controller
public class BondManagerController {

    @Autowired
    private BondService bondService;
    
    private static String bondMangement="BondMangement";

    @RequestMapping(path = "/manage", method = RequestMethod.GET)
    public String login() {
        return bondMangement;
    }

    @RequestMapping(value = "/insert",method =RequestMethod.POST)
    public String addBondRecord(DemoBondsSalesRecord bond, Model model)
    {
        bondService.insertBond(bond);
        List<DemoBondsSalesRecord> allRecords = bondService.selectAll();
        model.addAttribute("allRecords", allRecords);
        return bondMangement;
    }



    @RequestMapping(value = "/select",method =RequestMethod.GET)
    public String selectBondRecord(String salesName, String bondsName, Model model) {
        List<DemoBondsSalesRecord> demoBondsSalesRecords = bondService.selectBonds(salesName, bondsName);
        model.addAttribute("demoBondsSalesRecords", demoBondsSalesRecords);
        return bondMangement;
    }


}
