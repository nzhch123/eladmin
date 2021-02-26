package me.zhengjie.modules.system.rest;

import me.zhengjie.modules.system.domain.Labels;
import me.zhengjie.modules.system.repository.LabelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ResponseBody
@RestController
public class LabelsController {


    @Autowired
    LabelRepository labelRepository;

    /*restful 部分*/


    @GetMapping("/labels")
    public Map<String, String> getlabels() throws Exception {
        Map<String, String> map=new HashMap<>();
         List<Labels> labelsList= labelRepository.findAll();
        for (int i = 0; i <labelsList.size() ; i++) {
            map.put(labelsList.get(i).getLabel(),labelsList.get(i).getContent());
        }
        int i=1;
        return  map;
    }
}
