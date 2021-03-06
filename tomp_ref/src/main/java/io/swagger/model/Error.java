package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An error that the service may send, e.g. in case of invalid input, missing authorization or internal service error. see https://tools.ietf.org/html/rfc7807
 */
@ApiModel(description = "An error that the service may send, e.g. in case of invalid input, missing authorization or internal service error. see https://tools.ietf.org/html/rfc7807")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-04-23T14:08:29.073Z[GMT]")
public class Error   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("status")
  private BigDecimal status = null;

  @JsonProperty("detail")
  private String detail = null;

  @JsonProperty("instance")
  private String instance = null;

  public Error type(String type) {
    this.type = type;
    return this;
  }

  /**
   * A URI reference [RFC3986] that identifies the problem type.  This specification encourages that, when  dereferenced, it provide human-readable documentation for the problem type (e.g., using HTML [W3C.REC-html5-20141028]).  When this member is not present, its value is assumed to be \"about:blank\".
   * @return type
  **/
  @ApiModelProperty(value = "A URI reference [RFC3986] that identifies the problem type.  This specification encourages that, when  dereferenced, it provide human-readable documentation for the problem type (e.g., using HTML [W3C.REC-html5-20141028]).  When this member is not present, its value is assumed to be \"about:blank\".")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Error title(String title) {
    this.title = title;
    return this;
  }

  /**
   * A short, human-readable summary of the problem type.  It SHOULD NOT change from occurrence to occurrence of the problem, except for purposes of localization (e.g., using proactive content negotiation; see [RFC7231], Section 3.4).
   * @return title
  **/
  @ApiModelProperty(value = "A short, human-readable summary of the problem type.  It SHOULD NOT change from occurrence to occurrence of the problem, except for purposes of localization (e.g., using proactive content negotiation; see [RFC7231], Section 3.4).")
  
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Error status(BigDecimal status) {
    this.status = status;
    return this;
  }

  /**
   * The HTTP status code ([RFC7231], Section 6) generated by the origin server for this occurrence of the problem.
   * @return status
  **/
  @ApiModelProperty(value = "The HTTP status code ([RFC7231], Section 6) generated by the origin server for this occurrence of the problem.")
  
    @Valid
    public BigDecimal getStatus() {
    return status;
  }

  public void setStatus(BigDecimal status) {
    this.status = status;
  }

  public Error detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * A human-readable explanation specific to this occurrence of the problem.
   * @return detail
  **/
  @ApiModelProperty(value = "A human-readable explanation specific to this occurrence of the problem.")
  
    public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public Error instance(String instance) {
    this.instance = instance;
    return this;
  }

  /**
   * A URI reference that identifies the specific occurrence of the problem.  It may or may not yield further information if dereferenced.
   * @return instance
  **/
  @ApiModelProperty(value = "A URI reference that identifies the specific occurrence of the problem.  It may or may not yield further information if dereferenced.")
  
    public String getInstance() {
    return instance;
  }

  public void setInstance(String instance) {
    this.instance = instance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.type, error.type) &&
        Objects.equals(this.title, error.title) &&
        Objects.equals(this.status, error.status) &&
        Objects.equals(this.detail, error.detail) &&
        Objects.equals(this.instance, error.instance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, status, detail, instance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
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
