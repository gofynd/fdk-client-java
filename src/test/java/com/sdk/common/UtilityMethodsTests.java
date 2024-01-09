package com.sdk.common;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.sdk.fixtures.models.ActionToUrlCase;
import com.sdk.fixtures.models.ActionToUrlFixtureModel;
import com.sdk.fixtures.models.UrlToActionCase;
import com.sdk.fixtures.models.UrlToActionFixtureModel;


import com.sdk.application.content.ContentApplicationModels;

import com.sdk.platform.catalog.CatalogPlatformModels;

import com.sdk.platform.content.ContentPlatformModels;



public class UtilityMethodsTests {

    

    boolean isContentApplicationActionEqual(ContentApplicationModels.Action action1, ContentApplicationModels.Action action2){
        if(action1 == action2){
            return true;
        }

        // Comparing Type
        if(!(action1.getType() == null ? action2.getType() == null : action1.getType().equals(action2.getType()))){
            return false;
        }

        // Comparing page
        if(!isContentApplicationActionPageEqual(action1.getPage(), action2.getPage())){
            return false;
        }

        // Comparing popup
        if(!isContentApplicationActionPageEqual(action1.getPopup(), action2.getPopup())){
            return false;
        }

        return true;
    }

    boolean isContentApplicationActionPageEqual(ContentApplicationModels.ActionPage actionPage1, ContentApplicationModels.ActionPage actionPage2){
        if(actionPage1 == actionPage2){
            return true;
        }
        if(!(actionPage1.getUrl() == null ? actionPage2.getUrl() == null : actionPage1.getUrl().equals(actionPage2.getUrl()))){
            return false;
        }
        if(!(actionPage1.getType() == null ? actionPage2.getType() == null : actionPage1.getType().equals(actionPage2.getType()))){
            return false;
        }
        if(!(actionPage1.getParams() == null ? actionPage2.getParams() == null || actionPage2.getParams().isEmpty() : actionPage1.getParams().equals(actionPage2.getParams()))){
            return false;
        }
        if(!(actionPage1.getQuery() == null ? actionPage2.getQuery() == null || actionPage2.getQuery().isEmpty() : actionPage1.getQuery().equals(actionPage2.getQuery()))){
            return false;
        }
        return true;
    }

    @Test
    public void testConvertUrlToActionForApplicationContent(){
        UrlToActionFixtureModel<ContentApplicationModels.Action> testData;
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            TypeReference<UrlToActionFixtureModel<ContentApplicationModels.Action>> fixtureType = new TypeReference<UrlToActionFixtureModel<ContentApplicationModels.Action>>(){};

            testData = objectMapper.readValue(new File("src/test/java/com/sdk/fixtures/url-action.json"), fixtureType);

        } catch (StreamReadException e) {
            throw new RuntimeException(e);
        } catch (DatabindException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for(UrlToActionCase<ContentApplicationModels.Action> testCase : testData.getTests()){
            String testName = testCase.getName();
            String path = testCase.getPath();
            ContentApplicationModels.Action action = testCase.getResult().getAction();

            ContentApplicationModels.Action resultedAction = ContentApplicationModels.Action.convertUrlToAction(path);

//            boolean ans = isContentApplicationActionEqual(action, resultedAction);
//
//            if(ans == false){
//                ContentApplicationModels.Action.convertUrlToAction(path);
//            }

            Assertions.assertTrue(isContentApplicationActionEqual(action, resultedAction), "Test case: " + testName);

        }
    }


    @Test
    public void testConvertActionToUrlForApplicationContent(){
        ActionToUrlFixtureModel<ContentApplicationModels.Action> testData;
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            TypeReference<ActionToUrlFixtureModel<ContentApplicationModels.Action>> fixtureType = new TypeReference<ActionToUrlFixtureModel<ContentApplicationModels.Action>>(){};

            testData = objectMapper.readValue(new File("src/test/java/com/sdk/fixtures/action-url.json"), fixtureType);

        } catch (StreamReadException e) {
            throw new RuntimeException(e);
        } catch (DatabindException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for(ActionToUrlCase<ContentApplicationModels.Action> testCase : testData.getTests()){
            String testName = testCase.getName();
            ContentApplicationModels.Action action = testCase.getAction();
            String path = testCase.getResult().getPath();

            String resultedPath = ContentApplicationModels.Action.convertActionToUrl(action);

            Assertions.assertEquals(path, resultedPath, "Test case: " + testName);

        }
    }

    

    boolean isCatalogPlatformActionEqual(CatalogPlatformModels.Action action1, CatalogPlatformModels.Action action2){
        if(action1 == action2){
            return true;
        }

        // Comparing Type
        if(!(action1.getType() == null ? action2.getType() == null : action1.getType().equals(action2.getType()))){
            return false;
        }

        // Comparing page
        if(!isCatalogPlatformActionPageEqual(action1.getPage(), action2.getPage())){
            return false;
        }

        // Comparing popup
        if(!isCatalogPlatformActionPageEqual(action1.getPopup(), action2.getPopup())){
            return false;
        }

        return true;
    }

    boolean isCatalogPlatformActionPageEqual(CatalogPlatformModels.ActionPage actionPage1, CatalogPlatformModels.ActionPage actionPage2){
        if(actionPage1 == actionPage2){
            return true;
        }
        if(!(actionPage1.getUrl() == null ? actionPage2.getUrl() == null : actionPage1.getUrl().equals(actionPage2.getUrl()))){
            return false;
        }
        if(!(actionPage1.getType() == null ? actionPage2.getType() == null : actionPage1.getType().equals(actionPage2.getType()))){
            return false;
        }
        if(!(actionPage1.getParams() == null ? actionPage2.getParams() == null || actionPage2.getParams().isEmpty() : actionPage1.getParams().equals(actionPage2.getParams()))){
            return false;
        }
        if(!(actionPage1.getQuery() == null ? actionPage2.getQuery() == null || actionPage2.getQuery().isEmpty() : actionPage1.getQuery().equals(actionPage2.getQuery()))){
            return false;
        }
        return true;
    }

    @Test
    public void testConvertUrlToActionForPlatformCatalog(){
        UrlToActionFixtureModel<CatalogPlatformModels.Action> testData;
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            TypeReference<UrlToActionFixtureModel<CatalogPlatformModels.Action>> fixtureType = new TypeReference<UrlToActionFixtureModel<CatalogPlatformModels.Action>>(){};

            testData = objectMapper.readValue(new File("src/test/java/com/sdk/fixtures/url-action.json"), fixtureType);

        } catch (StreamReadException e) {
            throw new RuntimeException(e);
        } catch (DatabindException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for(UrlToActionCase<CatalogPlatformModels.Action> testCase : testData.getTests()){
            String testName = testCase.getName();
            String path = testCase.getPath();
            CatalogPlatformModels.Action action = testCase.getResult().getAction();

            CatalogPlatformModels.Action resultedAction = CatalogPlatformModels.Action.convertUrlToAction(path);

//            boolean ans = isCatalogPlatformActionEqual(action, resultedAction);
//
//            if(ans == false){
//                CatalogPlatformModels.Action.convertUrlToAction(path);
//            }

            Assertions.assertTrue(isCatalogPlatformActionEqual(action, resultedAction), "Test case: " + testName);

        }
    }


    @Test
    public void testConvertActionToUrlForPlatformCatalog(){
        ActionToUrlFixtureModel<CatalogPlatformModels.Action> testData;
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            TypeReference<ActionToUrlFixtureModel<CatalogPlatformModels.Action>> fixtureType = new TypeReference<ActionToUrlFixtureModel<CatalogPlatformModels.Action>>(){};

            testData = objectMapper.readValue(new File("src/test/java/com/sdk/fixtures/action-url.json"), fixtureType);

        } catch (StreamReadException e) {
            throw new RuntimeException(e);
        } catch (DatabindException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for(ActionToUrlCase<CatalogPlatformModels.Action> testCase : testData.getTests()){
            String testName = testCase.getName();
            CatalogPlatformModels.Action action = testCase.getAction();
            String path = testCase.getResult().getPath();

            String resultedPath = CatalogPlatformModels.Action.convertActionToUrl(action);

            Assertions.assertEquals(path, resultedPath, "Test case: " + testName);

        }
    }

    

    boolean isContentPlatformActionEqual(ContentPlatformModels.Action action1, ContentPlatformModels.Action action2){
        if(action1 == action2){
            return true;
        }

        // Comparing Type
        if(!(action1.getType() == null ? action2.getType() == null : action1.getType().equals(action2.getType()))){
            return false;
        }

        // Comparing page
        if(!isContentPlatformActionPageEqual(action1.getPage(), action2.getPage())){
            return false;
        }

        // Comparing popup
        if(!isContentPlatformActionPageEqual(action1.getPopup(), action2.getPopup())){
            return false;
        }

        return true;
    }

    boolean isContentPlatformActionPageEqual(ContentPlatformModels.ActionPage actionPage1, ContentPlatformModels.ActionPage actionPage2){
        if(actionPage1 == actionPage2){
            return true;
        }
        if(!(actionPage1.getUrl() == null ? actionPage2.getUrl() == null : actionPage1.getUrl().equals(actionPage2.getUrl()))){
            return false;
        }
        if(!(actionPage1.getType() == null ? actionPage2.getType() == null : actionPage1.getType().equals(actionPage2.getType()))){
            return false;
        }
        if(!(actionPage1.getParams() == null ? actionPage2.getParams() == null || actionPage2.getParams().isEmpty() : actionPage1.getParams().equals(actionPage2.getParams()))){
            return false;
        }
        if(!(actionPage1.getQuery() == null ? actionPage2.getQuery() == null || actionPage2.getQuery().isEmpty() : actionPage1.getQuery().equals(actionPage2.getQuery()))){
            return false;
        }
        return true;
    }

    @Test
    public void testConvertUrlToActionForPlatformContent(){
        UrlToActionFixtureModel<ContentPlatformModels.Action> testData;
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            TypeReference<UrlToActionFixtureModel<ContentPlatformModels.Action>> fixtureType = new TypeReference<UrlToActionFixtureModel<ContentPlatformModels.Action>>(){};

            testData = objectMapper.readValue(new File("src/test/java/com/sdk/fixtures/url-action.json"), fixtureType);

        } catch (StreamReadException e) {
            throw new RuntimeException(e);
        } catch (DatabindException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for(UrlToActionCase<ContentPlatformModels.Action> testCase : testData.getTests()){
            String testName = testCase.getName();
            String path = testCase.getPath();
            ContentPlatformModels.Action action = testCase.getResult().getAction();

            ContentPlatformModels.Action resultedAction = ContentPlatformModels.Action.convertUrlToAction(path);

//            boolean ans = isContentPlatformActionEqual(action, resultedAction);
//
//            if(ans == false){
//                ContentPlatformModels.Action.convertUrlToAction(path);
//            }

            Assertions.assertTrue(isContentPlatformActionEqual(action, resultedAction), "Test case: " + testName);

        }
    }


    @Test
    public void testConvertActionToUrlForPlatformContent(){
        ActionToUrlFixtureModel<ContentPlatformModels.Action> testData;
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            TypeReference<ActionToUrlFixtureModel<ContentPlatformModels.Action>> fixtureType = new TypeReference<ActionToUrlFixtureModel<ContentPlatformModels.Action>>(){};

            testData = objectMapper.readValue(new File("src/test/java/com/sdk/fixtures/action-url.json"), fixtureType);

        } catch (StreamReadException e) {
            throw new RuntimeException(e);
        } catch (DatabindException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for(ActionToUrlCase<ContentPlatformModels.Action> testCase : testData.getTests()){
            String testName = testCase.getName();
            ContentPlatformModels.Action action = testCase.getAction();
            String path = testCase.getResult().getPath();

            String resultedPath = ContentPlatformModels.Action.convertActionToUrl(action);

            Assertions.assertEquals(path, resultedPath, "Test case: " + testName);

        }
    }

    
}

