package com.teacherblitz.bean.search.name.domain;

import com.teacherblitz.bean.search.name.annotation.Super;

/**
 * 超级用户类
 *
 * @author teacherblitz
 * @since 2020/7/19
 */
@Super
public class SuperUser extends User {

    String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SuperUser{" +
                "address='" + address + '\'' +
                "} " + super.toString();
    }
}
