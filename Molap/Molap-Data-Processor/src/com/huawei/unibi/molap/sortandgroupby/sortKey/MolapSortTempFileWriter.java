/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.huawei.unibi.molap.sortandgroupby.sortKey;

import java.io.File;

import com.huawei.unibi.molap.sortandgroupby.exception.MolapSortKeyAndGroupByException;

/**
 * Project Name NSE V3R8C10 
 * Module Name : MOLAP Data Processor
 * Author :k00900841 
 * Created Date:10-Aug-2014
 * FileName : MolapSortTempFileWriter.java
 * Class Description : Interface for writing the sort temp file
 * Class Version 1.0
 */
public interface MolapSortTempFileWriter
{
    /**
     * Method will be used to initialise
     * @param file
     * @param entryCount
     * @throws MolapSortKeyAndGroupByException
     */
    void initiaize(File file,int entryCount) throws MolapSortKeyAndGroupByException;

    /**
     * Method will be used to finish 
     */
    void finish();
    
    /**
     * Below method will be used to write the sort temp file
     * @param records
     * @throws MolapSortKeyAndGroupByException
     */
    void writeSortTempFile(Object[][] records)throws MolapSortKeyAndGroupByException;
}