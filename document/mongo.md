# mongo study
## basic operator
db.help() 获取帮助

use mydb 切换数据库，如果没有那么创建  
```bash
> use md
switched to db md
```

show dbs 查看所有数据库
```bash
> show dbs
admin   0.000GB
config  0.000GB
local   0.000GB
mdb     0.000GB
mydb    0.000GB
```

db.dropDatabases() 删除数据库
```bash
> db.dropDatabase()
{ "ok" : 1 }
```

db 查看当前数据库  
```
> db
md
```

db.status() 查看状态  
```bash
> db.stats()
{
        "db" : "md",
        "collections" : 0,
        "views" : 0,
        "objects" : 0,
        "avgObjSize" : 0,
        "dataSize" : 0,
        "storageSize" : 0,
        "numExtents" : 0,
        "indexes" : 0,
        "indexSize" : 0,
        "fileSize" : 0,
        "fsUsedSize" : 0,
        "fsTotalSize" : 0,
        "ok" : 1
}
```

db.version() 查看版本  
```base
> db.version()
3.6.8
```

db.repairDatabase() 修复数据库
```
{ "ok" : 1 }
```

> db.getMongo() 获取地址
```bash
connection to 127.0.0.1:27017
```

## collection operatortion
> db.createCollection("dd") 创建collection
```
{ "ok" : 1 }
```

db.help()
```
DBCollection help
        db.dd.find().help() - show DBCursor help
        db.dd.bulkWrite( operations, <optional params> ) - bulk execute write operations, optional parameters are: w, wtimeout, j
        db.dd.count( query = {}, <optional params> ) - count the number of documents that matches the query, optional parameters are: limit, skip, hint, maxTimeMS
        db.dd.copyTo(newColl) - duplicates collection by copying all documents to newColl; no indexes are copied.
        db.dd.convertToCapped(maxBytes) - calls {convertToCapped:'dd', size:maxBytes}} command
        db.dd.createIndex(keypattern[,options])
        db.dd.createIndexes([keypatterns], <options>)
```
db.dd.stats()

```
db.dd.stats()
{
        "ns" : "md.dd",
        "size" : 0,
        "count" : 0,
        "storageSize" : 4096,
        "capped" : false,
        "wiredTiger" : {
                "metadata" : {
```

db.dd.insert({"123":"dsdd"})
```
> db.dd.insert({"123":"dsdd"})
WriteResult({ "nInserted" : 1 })
```
db.dd.find()

```
> db.dd.find()
{ "_id" : ObjectId("5f0fb52e6963d947d0e0820a"), "123" : "dsdd" }
```
db.dd.find({"123":"dsdd"})
```
> db.dd.find({"123":"dsdd"})
{ "_id" : ObjectId("5f0fb52e6963d947d0e0820a"), "123" : "dsdd" }
```
