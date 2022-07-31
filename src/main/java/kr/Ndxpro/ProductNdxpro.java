package kr.Ndxpro;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;

@Builder
public class ProductNdxpro implements Comparable<ProductNdxpro> {


    String code;

    String label;

    String type;


    String detailLabel;

    @JsonIgnore
    int orderNuml;

    public ProductNdxpro(String code, String label, String type, String detailLabel, int orderNuml) {
        this.code = code;
        this.label = label;
        this.type = type;
        this.detailLabel = detailLabel;
        this.orderNuml = orderNuml;
    }

    public String getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }

    public String getType() {
        return type;
    }

    public String getDetailLabel() {
        return detailLabel;
    }

    public int getOrderNuml() {
        return orderNuml;
    }


    @Override
    public String toString() {
        return "ProductNdxpro{" +
                "code='" + code + '\'' +
                ", label='" + label + '\'' +
                ", type='" + type + '\'' +
                ", detailLabel='" + detailLabel + '\'' +
                ", orderNuml=" + orderNuml +
                '}';
    }

    @Override
    public int compareTo(ProductNdxpro o) {
        return  o.getOrderNuml() - o.getOrderNuml();
    }
}

