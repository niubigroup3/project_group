package com.citi.dao;

import com.citi.bean.DemoBondsSalesRecord;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;

/**
 * @Auther: chenle
 * @Date: 2020/8/26 - 15:32
 * @Description: com.citi.dao
 * @version: 1.0
 */
class BondMapperTest {

    @Resource
    BondMapper bondMapper;

    @Test
    void selectBondByName() {
        List<DemoBondsSalesRecord> demoBondsSalesRecords = bondMapper.selectBondByName("lwj", "zfzq");
        assertFalse(demoBondsSalesRecords.isEmpty());
    }


    @Test
    void selectBondById() {
        DemoBondsSalesRecord demoBondsSalesRecord = bondMapper.selectBondById(1);
        assertEquals("zfzq", demoBondsSalesRecord.getBondsName());
    }
    
   
    @Test
    void selectAll() {
        List<DemoBondsSalesRecord> demoBondsSalesRecords = bondMapper.selectBondByName("lwj", "zfzq");
        assertFalse(demoBondsSalesRecords.isEmpty());
    }


}