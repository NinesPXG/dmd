/**
 * @MapperScan works before @Mapper ,
 * so can avoid Error bean not found while inject the mapper
 * for files like gatewayImpl which use these mappers with @autowired and so on
 */

