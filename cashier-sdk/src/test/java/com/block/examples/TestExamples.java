package com.block.examples;

import com.alibaba.fastjson.JSON;
import com.block.Constants;
import com.block.constant.BlockOptions;
import com.block.model.req.Goods;
import com.block.model.req.ProductInfoAddDto;
import com.block.model.req.ProductsInfoQueryDto;
import com.block.model.req.RechargeAddDto;
import com.block.model.resp.ProductsInfoVo;
import com.block.model.resp.SellerAccountVo;
import com.block.service.CashierService;

import java.util.ArrayList;
import java.util.List;


public class TestExamples {
    public static void main(String[] args)  {
        CashierService cashierService = CashierService.create(BlockOptions.builder()
                .accessKey(Constants.ACCESSKEY)
                .secretKey(Constants.SECRETKEY)
                .build());
//        SellerAccountVo sellerAccountVo = cashierService.getSellerAccountVo();
//        System.out.println(sellerAccountVo);
//        ProductInfoAddDto addDto = new ProductInfoAddDto();
//        addDto.setProductsAmount(100.00);
//        addDto.setRemark("测试收款单创建");
//        addDto.setExternalOrderId("abc-123-123");
//        addDto.setStoreName("宇宙商店");
//        List<Goods> goodsList = new ArrayList<>();
//        Goods goods = new Goods();
//        goods.setGoodsName("iphone13");
//        goods.setGoodsSize(100);
//        goods.setGoodsPrice(100.00);
//        goodsList.add(goods);
//        addDto.setGoodsList(goodsList);
//        ProductsInfoVo vo = cashierService.addProducts(addDto);
//        System.out.println(vo);

//        List<ProductsInfoVo> voList = cashierService.listProducts(null);
//        System.out.println(voList);
//USDT(0,"USDT","USDT"),
//    CNY(1,"人民币","CNY"),
//    USD(2,"美元","USD"),
//        RechargeAddDto dto = new RechargeAddDto();
//        dto.setAssetType(102);
//        dto.setTokenType(901);
//        dto.setAmount(100.00);
//        dto.setType(0);
//        dto.setExternalOrderId("123131313");
//        cashierService.addRecharge(dto);
        ProductsInfoQueryDto dto = new ProductsInfoQueryDto();
        dto.setExternalOrderId("abc-123-123");
        dto.setProductId(123131313L);
        List<ProductsInfoVo> voList = cashierService.listProducts(dto);
        System.out.println(voList);

    }
}
