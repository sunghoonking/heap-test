package kr.Ndxpro;


import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;


@Service
public class Test {
        public static void main(String[] args) {

                PriorityQueue<ProductNdxpro> priorityQueue = new PriorityQueue<>();


                ArrayList<ProductNdxpro> productNdxpros = new ArrayList<>();

                productNdxpros.add( new ProductNdxpro("PF", "라이선스 (NFLOW)", "라이선스", "NFLOW", 1));
                productNdxpros.add( new ProductNdxpro("PN", "라이선스 (NDX Pro)", "라이선스", "NDX PRO", 3));
                productNdxpros.add( new ProductNdxpro("SF", "용역 (NFLOW)", "용역", "NFLOW", 2));
                productNdxpros.add( new ProductNdxpro("SN", "용역 (NDX Pro)", "용역", "NDX PRO", 4));
                productNdxpros.add( new ProductNdxpro("RD", "R&D/지원사업", "R&D", "R&D", 5));

                productNdxpros.add( new ProductNdxpro("FF", "자유계약", "FF", "FF", 1));


                productNdxpros.add( new ProductNdxpro("N", "NDXPRO", "type", "detailLabel", 0));
                productNdxpros.add( new ProductNdxpro("F", "NFLOW", "type", "detailLabel", 0));
                productNdxpros.add( new ProductNdxpro("D", "R&D", "type", "detailLabel", 0));

                // PF SF PN SN RD

                //만약에 새로운 인덱스가 들어왔으면 그 인덱스에 뭐를 체크해서 하는데

                // 그거에 대한 기준을 뭐로 잡을까

                // NFLOW NFLOW NDXPRO NDXPRO R&D

                Collections.sort(productNdxpros);

                System.out.println(productNdxpros);

        }

}



//        ProductNdxpro productNdxpro = new ProductNdxpro("PN", "라이선스 (NDX Pro)", "라이선스", "NDX PRO", 3);
//
//        ProductNdxpro productNflow = new ProductNdxpro("PF", "라이선스 (NFLOW)", "라이선스", "NFLOW", 1);
//
//        ProductNdxpro serivceNdxpro = new ProductNdxpro("SN", "용역 (NDX Pro)", "용역", "NDX PRO", 4);
//
//        ProductNdxpro serviceNflow = new ProductNdxpro("SF", "용역 (NFLOW)", "용역", "NFLOW", 2);
//
//        ProductNdxpro rANd = new ProductNdxpro("RD", "R&D/지원사업", "R&D", "R&D", 5);
//
//        ProductNdxpro ndxpro = new ProductNdxpro("N", "NDXPRO", "type", "detailLabel", 0);
//
//        ProductNdxpro nflow = new ProductNdxpro("F", "NFLOW", "type", "detailLabel", 0);
//
//        ProductNdxpro rd = new ProductNdxpro("D", "R&D", "type", "detailLabel", 0);
//





