BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "school" (
	"id"	INTEGER,
	"sId"	TEXT,
	"sName"	TEXT,
	"sPhone"	TEXT,
	"sEmail"	TEXT,
	"sPass"	TEXT,
	"sAdrs"	TEXT,
	"sEiin"	TEXT,
	"sFund"	TEXT,
	"sTeacher"	INTEGER,
	"sEml"	INTEGER,
	"sActivate"	INTEGER,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "Users" (
	"id"	INTEGER,
	"u_id"	TEXT,
	"name"	TEXT,
	"email"	TEXT,
	"phone"	TEXT,
	"pass"	TEXT,
	"bal"	TEXT,
	"u_type"	INTEGER,
	"sId"	TEXT,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "aYear" (
	"id"	INTEGER,
	"uId"	TEXT,
	"aYname"	TEXT,
	"sYear"	TEXT,
	"sMonth"	TEXT,
	"eYear"	TEXT,
	"eMonth"	TEXT,
	"aStatus"	INTEGER,
	"sId"	TEXT,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "sclData" (
	"id"	INTEGER,
	"sId"	TEXT,
	"sclAddress"	TEXT,
	"sclReg"	TEXT,
	"sclStd"	INTEGER,
	"sclTea"	INTEGER,
	"sclCourse"	INTEGER,
	"sclSec"	INTEGER,
	"sclUser"	INTEGER,
	"sclClasse"	INTEGER,
	"sclItp1"	TEXT,
	"sclItp2"	TEXT,
	"sclItEmail"	TEXT,
	"sclWeb"	TEXT,
	"sclFundsBal"	TEXT,
	"sclFundsBank"	TEXT,
	"sclFundsAN"	TEXT,
	"sclLogo"	INTEGER,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "students" (
	"id"	INTEGER,
	"sId"	TEXT,
	"stdId"	TEXT,
	"uId"	TEXT,
	"stdName"	TEXT,
	"nidBirth"	TEXT,
	"stdPhone"	TEXT,
	"stdEmail"	TEXT,
	"homePhone"	TEXT,
	"stdReligion"	TEXT,
	"dob"	TEXT,
	"address"	TEXT,
	"country"	TEXT,
	"UnionWord"	TEXT,
	"aStatus"	INTEGER,
	"fatherName"	TEXT,
	"motherName"	TEXT,
	"fNid"	TEXT,
	"mNid"	TEXT,
	"gName"	TEXT,
	"gAddress"	TEXT,
	"gPhone"	TEXT,
	"gEmail"	TEXT,
	"sdtImg"	TEXT,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "classes" (
	"id"	INTEGER,
	"clsId"	TEXT,
	"sId"	TEXT,
	"clsName"	TEXT,
	"clsCode"	TEXT,
	"aYear"	TEXT,
	"aStatus"	INTEGER,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "subject" (
	"id"	INTEGER,
	"subId"	TEXT,
	"sId"	TEXT,
	"subName"	TEXT,
	"subCode"	TEXT,
	"subFee"	TEXT,
	"aStatus"	INTEGER,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "sections" (
	"id"	INTEGER,
	"sId"	TEXT,
	"clsId"	TEXT,
	"secName"	TEXT,
	"secCode"	TEXT,
	"secFee"	TEXT,
	"secNumStd"	INTEGER,
	"secTeaId"	TEXT,
	"aStatus"	INTEGER,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "secAssigned" (
	"id"	INTEGER,
	"secId"	TEXT,
	"clsId"	TEXT,
	"stdId"	TEXT,
	"sId"	TEXT,
	"date"	TEXT,
	"aYear"	TEXT,
	"aStatus"	INTEGER,
	"feeTk"	TEXT,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "subAssigned" (
	"id"	INTEGER,
	"subId"	TEXT,
	"secId"	TEXT,
	"clsId"	TEXT,
	"sId"	TEXT,
	"stdId"	TEXT,
	"feeTk"	TEXT,
	"aStatus"	INTEGER,
	PRIMARY KEY("id" AUTOINCREMENT)
);
INSERT INTO "school" ("id","sId","sName","sPhone","sEmail","sPass","sAdrs","sEiin","sFund","sTeacher","sEml","sActivate") VALUES (2,'a1b02e71-e69e-403e-9c9d-502acef0b26a','mff','01585855075','mff@gmail.com','369725',NULL,NULL,NULL,NULL,NULL,NULL),
 (3,'1ccf37cc-d142-48d2-80e8-5f9adf0513ee','East Delta University','01816444372','edu@gmail.com','369725',NULL,NULL,NULL,NULL,NULL,NULL);
INSERT INTO "Users" ("id","u_id","name","email","phone","pass","bal","u_type","sId") VALUES (1,'202303140501','mff','mff@gmail.com','01585855075','369725',NULL,1,'a1b02e71-e69e-403e-9c9d-502acef0b26a'),
 (2,'20230317061701','East Delta University','edu@gmail.com','01816444372','369725',NULL,1,'1ccf37cc-d142-48d2-80e8-5f9adf0513ee');
INSERT INTO "aYear" ("id","uId","aYname","sYear","sMonth","eYear","eMonth","aStatus","sId") VALUES (2,'20230320035336','March-May-1','2023','3','2023','5',1,'4544');
COMMIT;
