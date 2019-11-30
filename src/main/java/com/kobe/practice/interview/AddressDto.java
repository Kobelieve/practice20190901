package com.kobe.practice.interview;

/**
 * @ClassName: AddressDto
 * @Description: TODO
 * @Author: Tao
 * @Date 2019-10-27 13:29
 */
public class AddressDto {

    private String guid;
    private String parentGuid;
    private String name;

    public AddressDto() {
    }

    public AddressDto(String guid, String parentGuid, String name) {
        this.guid = guid;
        this.parentGuid = parentGuid;
        this.name = name;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getParentGuid() {
        return parentGuid;
    }

    public void setParentGuid(String parentGuid) {
        this.parentGuid = parentGuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AddressDto)) return false;

        AddressDto that = (AddressDto) o;

        if (guid != null ? !guid.equals(that.guid) : that.guid != null) return false;
        if (parentGuid != null ? !parentGuid.equals(that.parentGuid) : that.parentGuid != null) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = guid != null ? guid.hashCode() : 0;
        result = 31 * result + (parentGuid != null ? parentGuid.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
