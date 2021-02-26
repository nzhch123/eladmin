package me.zhengjie.modules.system.domain.vo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import me.zhengjie.modules.system.domain.Goods;

import java.util.List;

@JsonIgnoreProperties
@Data
public class ReceiveGood {
    private boolean success;
    private int  errorCode;
    private String errorMsg;
    private List<Goods> result;

}
