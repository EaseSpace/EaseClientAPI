package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CustomersCredentials;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Account
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T13:59:24.359Z")

public class Account   {
  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("creationDate")
  private BigDecimal creationDate = null;

  @JsonProperty("lastUpdateDate")
  private BigDecimal lastUpdateDate = null;

  @JsonProperty("credentials")
  private CustomersCredentials credentials = null;

  public Account id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "123.0", value = "")

  @Valid

  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public Account creationDate(BigDecimal creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @ApiModelProperty(example = "12345678 (time in ms)", value = "")

  @Valid

  public BigDecimal getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(BigDecimal creationDate) {
    this.creationDate = creationDate;
  }

  public Account lastUpdateDate(BigDecimal lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
    return this;
  }

   /**
   * Get lastUpdateDate
   * @return lastUpdateDate
  **/
  @ApiModelProperty(example = "12345678 (time in ms)", value = "")

  @Valid

  public BigDecimal getLastUpdateDate() {
    return lastUpdateDate;
  }

  public void setLastUpdateDate(BigDecimal lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
  }

  public Account credentials(CustomersCredentials credentials) {
    this.credentials = credentials;
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public CustomersCredentials getCredentials() {
    return credentials;
  }

  public void setCredentials(CustomersCredentials credentials) {
    this.credentials = credentials;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.id, account.id) &&
        Objects.equals(this.creationDate, account.creationDate) &&
        Objects.equals(this.lastUpdateDate, account.lastUpdateDate) &&
        Objects.equals(this.credentials, account.credentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, creationDate, lastUpdateDate, credentials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    lastUpdateDate: ").append(toIndentedString(lastUpdateDate)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

