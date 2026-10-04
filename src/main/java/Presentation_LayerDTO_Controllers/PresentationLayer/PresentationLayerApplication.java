package Presentation_LayerDTO_Controllers.PresentationLayer;
// हा class कोणत्या package मध्ये आहे ते सांगतो.
// Package म्हणजे related Java files व्यवस्थित organize करण्यासाठीचा folder/group.
// इथे package चे नाव:
// Presentation_LayerDTO_Controllers.PresentationLayer


import org.springframework.boot.SpringApplication;
// SpringApplication हा Spring Boot चा class आहे.
// याचा उपयोग Spring Boot application सुरू करण्यासाठी केला जातो.


import org.springframework.boot.autoconfigure.SpringBootApplication;
// @SpringBootApplication annotation वापरण्यासाठी हा import आवश्यक आहे.
// ही annotation Spring Boot application ची मुख्य configuration सुरू करते.



@SpringBootApplication
// ही Spring Boot ची सर्वात important annotation आहे.
// Spring ला सांगते:
// "ही Spring Boot application आहे; application configure करून सुरू कर."

// ही एकच annotation internally 3 मुख्य annotations चे काम करते:
// @SpringBootConfiguration
// → ही main configuration class आहे असे सांगते.
// @EnableAutoConfiguration
// → आवश्यक Spring configuration आपोआप configure करते.
// @ComponentScan
// → Controller, Service, Repository, Component इत्यादी classes शोधते.


public class PresentationLayerApplication {
// हा तुझ्या application चा MAIN CLASS आहे.
//
// Spring Boot application सुरू करण्यासाठी हा class वापरला जातो.
//
// Class चे नाव:
// PresentationLayerApplication


    public static void main(String[] args) {
        // हा Java चा MAIN METHOD आहे.
        //
        // Java application सुरू झाल्यावर सर्वात आधी execution इथून सुरू होते.
        //
        // String[] args:
        // command line मधून आलेले arguments store करण्यासाठी वापरले जाते.


        SpringApplication.run(PresentationLayerApplication.class, args);
        // ही line पूर्ण Spring Boot application START करते.
        // SpringApplication.run() काय करते?
        // 1. Spring Application सुरू करते
        // 2. Spring Container तयार करते
        // 3. आवश्यक Beans तयार करते
        // 4. Controller / Service / Repository शोधते
        // 5. Configuration load करते
        // 6. Embedded Server सुरू करते
        // 7. Application requests स्वीकारण्यासाठी तयार होते
        // PresentationLayerApplication.class
        // → Spring ला सांगते की कोणती Main Configuration class वापरायची.
        // args
        // → main method ला मिळालेले command-line arguments Spring ला देते.
    }
// main() method समाप्त

}
// PresentationLayerApplication class समाप्त