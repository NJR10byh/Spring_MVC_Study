package com.migufun.pojo;

/**
 * @author NJR10byh
 * @date 2022/8/21 23:52:54
 * @description
 */
public class Address
{
    private String province;
    private String city;
    
    public Address()
    {
    }
    
    public Address(String province, String city)
    {
        this.province = province;
        this.city = city;
    }
    
    public String getProvince()
    {
        return province;
    }
    
    public void setProvince(String province)
    {
        this.province = province;
    }
    
    public String getCity()
    {
        return city;
    }
    
    public void setCity(String city)
    {
        this.city = city;
    }
    
    
    @Override
    public String toString()
    {
        return "address{" + "province='" + province + '\'' + ", city='" + city + '\'' + '}';
    }
}
