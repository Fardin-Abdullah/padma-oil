package com.example.padmaoilcompany;

public class ProductSpecification {
    private String SpecificationID;
    private String ProductType, DetailSpecification;

    public ProductSpecification() {
    }

    public ProductSpecification(String detailSpecification, String productType, String specificationID) {
        DetailSpecification = detailSpecification;
        ProductType = productType;
        SpecificationID = specificationID;
    }

    public String getSpecificationID() {
        return SpecificationID;
    }

    public void setSpecificationID(String specificationID) {
        SpecificationID = specificationID;
    }

    public String getProductType() {
        return ProductType;
    }

    public void setProductType(String productType) {
        ProductType = productType;
    }

    public String getDetailSpecification() {
        return DetailSpecification;
    }

    public void setDetailSpecification(String detailSpecification) {
        DetailSpecification = detailSpecification;
    }

    @Override
    public String toString() {
        return "ProductSpecification{" +
                "SpecificationID='" + SpecificationID + '\'' +
                ", ProductType='" + ProductType + '\'' +
                ", DetailSpecification='" + DetailSpecification + '\'' +
                '}';
    }
}
