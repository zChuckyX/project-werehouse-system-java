# 🖥️ Project - Warehouse Management And Transport System with Java Swing

> Project จำลองการจัดการคลังสินค้าและการขนส่ง ด้วยภาษา Java Swing

## 🛠️ Features
- **ระบบจัดการสินค้า**: ผู้ดูแลระบบสามารถ เพิ่ม และ ลบ สินค้าในระบบได้ โดยราคาสินค้าราคาจะมีการเปลี่ยนแปลงแบบสุ่มอยู่ตลอดเวลา
- **ระบบซื้อขายสินค้า**: ผู้ใช้สามารถ ซื้อ หรือ ขาย สินค้าได้ตาม จำนวนที่กำหนด โดยสามารถเลือกขายได้ 2 ประเภท 1.ขายสู่ตลาด 2.ขายสู่ลูกค้า โดยระบบจะคำนวณราคาและแสดงข้อมูลการทำรายการอย่างชัดเจน รวมถึงการจัดการสต็อกสินค้าเมื่อมีการทำธุรกรรม
- **ระบบขนส่งสินค้า**: ระบบการขนส่งสินค้าครอบคลุมทุกขั้นตอนของการซื้อและขายสินค้า โดยการขนส่งแต่ละครั้งจะถูกจัดการผ่านระบบคิวแบบ Circular Queue เพื่อจัดการลำดับการขนส่งได้อย่างมีระเบียบและมีประสิทธิภาพ 
- **ระบบลูกค้า**: ระบบจะทำการ สุ่มลูกค้า เข้ามาซื้อสินค้าอย่างต่อเนื่อง โดย สุ่มสินค้า และ สุ่มราคา ของสินค้าในแต่ละรอบการทำธุรกรรม นอกจากนี้ยังมี status สำหรับการติดตามสถานะการซื้อสินค้าของลูกค้าในแต่ละขั้นตอน เช่น Pending, In Transit, หรือ Completed เพื่อให้สามารถตรวจสอบสถานะการซื้อขายได้ตลอดเวลา
- **ระบบบันทึกกิจกรรม**: ทุกการซื้อและขายสินค้าจะถูกบันทึกลงใน Log เพื่อให้สามารถติดตามและตรวจสอบกิจกรรมการทำรายการในอนาคต รวมถึงช่วยในการตรวจสอบประสิทธิภาพของระบบ
- **ระบบเงิน**: ระบบจัดการเงินสำหรับการ ซื้อสินค้าเข้าสู่ Warehouse โดยหักเงินจากยอดคงเหลือ และ ขายสินค้าออกจาก Warehouse ซึ่งจะได้รับเงินตามราคาที่กำหนด พร้อมคำนวณกำไรและยอดเงินที่ผู้ใช้ได้รับจากการขายสินค้า.

## 📜 License

This project is open-source under the MIT License. Let me know if you need any modifications! 🚀

## 🗺️ Project Structure

```bash
project-werehouse-system-java/
├── LICENSE            # Contains the project’s license (MIT License)
├── README.md          # Documentation file explaining how to use the project
├── build.xml          
├── manifest.mf        
├── src/Project/       # Source code directory for the main project files
|   ├── InterfaceUI.form      
|   └── InterfaceUI.java      
├── dist/   # Distribution directory
|   ├── README.txt                   
|   ├── Werehouse_Management.jar     # The main executable JAR file for the warehouse management system
|   └── lib/                         # Library directory for external dependencies
|       └── AbsoluteLayout.jar       
└── nbproject/      # NetBeans project configuration files
|   ├── build-impl.xml               
|   ├── genfiles.properties          
|   ├── project.properties           
|   └── project.xml                 
```

## ⚙️ Installation 
To run this Project:

```bash
git clone https://github.com/zChuckyX/project-werehouse-system-java.git
```
```bash
cd project-werehouse-system-java/dist
```
```bash
java -jar Werehouse_Management.jar
```
