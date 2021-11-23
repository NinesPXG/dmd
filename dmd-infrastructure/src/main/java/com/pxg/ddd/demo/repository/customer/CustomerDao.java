package com.pxg.ddd.demo.repository.customer;

import lombok.Data;

@Data
public class CustomerDao {
  private String customerId;
  private String memberId;
  private String globalId;
  private long registeredCapital;
  private String companyName;
}
