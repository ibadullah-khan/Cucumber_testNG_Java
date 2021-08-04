package PageObjectFactory;

import EnumFactory.CartPageEnum;
import UtilitiesFactory.ElementFactory;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPageFactory extends UtilFactory {

    ElementFactory elementFactory = new ElementFactory();

    public CartPageFactory() throws Exception {
    }

    public void validateItemContainerHeadingVisibility(String expectedLocator, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_ITEM_CONTAINER_HEADING_START.getValue()
                + expectedLocator + CartPageEnum.XPATH_ITEM_CONTAINER_HEADING_END.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Item Container have " + expectedLocator + " Heading Displayed on Cart Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Item Container does not have " + expectedLocator + " Heading Displayed as Expected on Cart Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Item Container have " + expectedLocator + " Heading Displayed Unexpectedly on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Item Container does not have " + expectedLocator + " Heading Displayed Unexpectedly on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateItemContainerContentVisibility(String expectedLocator, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_ITEM_CONTAINER_CONTENT_START.getValue()
                + expectedLocator + CartPageEnum.XPATH_ITEM_CONTAINER_CONTENT_END.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Item Container have " + expectedLocator + " Content Displayed on Cart Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Item Container does not have " + expectedLocator + " Content Displayed as Expected on Cart Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Item Container have " + expectedLocator + " Content Displayed Unexpectedly on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Item Container does not have " + expectedLocator + " Content Displayed Unexpectedly on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateCartItemQuantity(String expectedValue) {
        String locator = CartPageEnum.XPATH_ITEM_QUANTITY_COUNTER.getValue();
        String errorMsg = null;
        String actualValue;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualValue = getText(locator);
            if (actualValue.contains(expectedValue)) {
                scenarioDef.log(Status.PASS, "Validated Cart has " + expectedValue + " Items Added");
            } else {
                errorMsg = "Could not validate Cart has as Expected Item Count: " + expectedValue + ", Actual Value is: " + actualValue;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateQuantityOfProductAdded(String expectedValue) {
        String locator = CartPageEnum.XPATH_PRODUCT_QUANTITY.getValue();
        String errorMsg = null;
        String actualValue;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualValue = getAttribute(locator, "value");
            if (actualValue.contains(expectedValue)) {
                scenarioDef.log(Status.PASS, "Validated Product Quantity is " + expectedValue + " on Cart Page");
            } else {
                errorMsg = "Could not validate Product Quantity is: " + expectedValue + " on Cart Page, Actual Value is: " + actualValue;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateSummarySectionVisibility(Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_SUMMARY_SECTION.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Summary Section is Displayed on Cart Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Summary Section is not Displayed as Expected on Cart Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Summary Section is Displayed Unexpectedly on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Summary Section is not Displayed Unexpectedly on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateDifferentProductNoAdded(String expectedCount) {
        String locator = CartPageEnum.XPATH_PRODUCT_SECTION.getValue();
        String errorMsg = null;
        String actualCount;
        try {
                waitFactory.waitForElementToBeClickable(locator);
                actualCount = String.valueOf(getSize(locator));
                if (expectedCount.equals(actualCount)) {
                    scenarioDef.log(Status.PASS, "Validated " + expectedCount + " products are added as Expected on Cart");
                } else {
                    errorMsg = "Could not validate " + expectedCount + " products are added as Expected on Cart, Actual: " + actualCount;
                    throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
                }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Section Element on Cart");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateProductNameVisibility(int expectedProductNo, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_PRODUCT_NAME.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List<WebElement> elements;
        try {
                elements = elementFactory.getElementsList(locator);
                actualVisibility = expectedProductNo == elements.size();
                if (actualVisibility && expectedVisibility) {
                    scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Name is Displayed as Expected on Cart View");
                } else if (!actualVisibility && !expectedVisibility) {
                    scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Name is Not Displayed as Expected on Cart View");
                } else if (actualVisibility && !expectedVisibility) {
                    errorMsg = "Validated " + expectedProductNo + " Product Name is Displayed Unexpected on Cart View";
                    throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
                } else if (!actualVisibility && expectedVisibility) {
                    errorMsg = "Validated " + expectedProductNo + " Product Name is not Displayed Unexpected on Cart View";
                    throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
                }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Name Element on Cart");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateProductPriceVisibility(int expectedProductNo, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_PRODUCT_PRICE.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List<WebElement> elements;
        try {
                elements = elementFactory.getElementsList(locator);
                actualVisibility = expectedProductNo == elements.size();
                if (actualVisibility && expectedVisibility) {
                    scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Price is Displayed as Expected on Cart View");
                } else if (!actualVisibility && !expectedVisibility) {
                    scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Price is Not Displayed as Expected on Cart View");
                } else if (actualVisibility && !expectedVisibility) {
                    errorMsg = "Validated " + expectedProductNo + " Product Price is Displayed Unexpected on Cart View";
                    throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
                } else if (!actualVisibility && expectedVisibility) {
                    errorMsg = "Validated " + expectedProductNo + " Product Price is not Displayed Unexpected on Cart View";
                    throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
                }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Price Element on Cart");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateProductImageVisibility(int expectedProductNo, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_PRODUCT_IMAGE.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List<WebElement> elements;
        try {
                elements = elementFactory.getElementsList(locator);
                actualVisibility = expectedProductNo == elements.size();
                if (actualVisibility && expectedVisibility) {
                    scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Image is Displayed as Expected on Cart View");
                } else if (!actualVisibility && !expectedVisibility) {
                    scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Image is Not Displayed as Expected on Cart View");
                } else if (actualVisibility && !expectedVisibility) {
                    errorMsg = "Validated " + expectedProductNo + " Product Image is Displayed Unexpected on Cart View";
                    throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
                } else if (!actualVisibility && expectedVisibility) {
                    errorMsg = "Validated " + expectedProductNo + " Product Image is not Displayed Unexpected on Cart View";
                    throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
                }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Image Element on Cart");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateProductRemoveVisibility(int expectedProductNo, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_PRODUCT_REMOVE_LINK.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List<WebElement> elements;
        try {
                elements = elementFactory.getElementsList(locator);
                actualVisibility = expectedProductNo == elements.size();
                if (actualVisibility && expectedVisibility) {
                    scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Remove Link is Displayed as Expected on Cart View");
                } else if (!actualVisibility && !expectedVisibility) {
                    scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Remove Link is Not Displayed as Expected on Cart View");
                } else if (actualVisibility && !expectedVisibility) {
                    errorMsg = "Validated " + expectedProductNo + " Product Remove Link is Displayed Unexpected on Cart View";
                    throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
                } else if (!actualVisibility && expectedVisibility) {
                    errorMsg = "Validated " + expectedProductNo + " Product Remove Link is not Displayed Unexpected on Cart View";
                    throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
                }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Remove Link Element on Cart");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateProductColorVisibility(int expectedProductNo, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_PRODUCT_COLOUR.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List<WebElement> elements;
        try {
                elements = elementFactory.getElementsList(locator);
                actualVisibility = expectedProductNo == elements.size();
                if (actualVisibility && expectedVisibility) {
                    scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Color is Displayed as Expected on Cart View");
                } else if (!actualVisibility && !expectedVisibility) {
                    scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Color is Not Displayed as Expected on Cart View");
                } else if (actualVisibility && !expectedVisibility) {
                    errorMsg = "Validated " + expectedProductNo + " Product Color is Displayed Unexpected on Cart View";
                    throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
                } else if (!actualVisibility && expectedVisibility) {
                    errorMsg = "Validated " + expectedProductNo + " Product Color is not Displayed Unexpected on Cart View";
                    throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
                }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Color Element on Cart");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateProductSizeVisibility(int expectedProductNo, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_PRODUCT_SIZE.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List<WebElement> elements;
        try {
                elements = elementFactory.getElementsList(locator);
                actualVisibility = expectedProductNo == elements.size();
                if (actualVisibility && expectedVisibility) {
                    scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Size is Displayed as Expected on Cart View");
                } else if (!actualVisibility && !expectedVisibility) {
                    scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Size is Not Displayed as Expected on Cart View");
                } else if (actualVisibility && !expectedVisibility) {
                    errorMsg = "Validated " + expectedProductNo + " Product Size is Displayed Unexpected on Cart View";
                    throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
                } else if (!actualVisibility && expectedVisibility) {
                    errorMsg = "Validated " + expectedProductNo + " Product Size is not Displayed Unexpected on Cart View";
                    throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
                }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Size Element on Cart");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateProductBrandVisibility(int expectedProductNo, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_PRODUCT_BRAND.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List<WebElement> elements;
        try {
            elements = elementFactory.getElementsList(locator);
            actualVisibility = expectedProductNo == elements.size();
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Brand is Displayed as Expected on Cart View");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Brand is Not Displayed as Expected on Cart View");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Brand is Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Brand is not Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Brand Element on Cart");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateProductEstDateVisibility(int expectedProductNo, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_PRODUCT_DATE.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List<WebElement> elements;
        try {
            elements = elementFactory.getElementsList(locator);
            actualVisibility = expectedProductNo == elements.size();
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Date is Displayed as Expected on Cart View");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Date is Not Displayed as Expected on Cart View");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Date is Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Date is not Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Date Element on Cart");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateAllProductsAttributesVisibility(String expectedCount, Boolean expectedVisibility) {
        try {
            validateProductNameVisibility(Integer.parseInt(expectedCount), expectedVisibility);
            validateProductPriceVisibility(Integer.parseInt(expectedCount), expectedVisibility);
            validateProductImageVisibility(Integer.parseInt(expectedCount), expectedVisibility);
            validateProductRemoveVisibility(Integer.parseInt(expectedCount), expectedVisibility);
            validateProductColorVisibility(Integer.parseInt(expectedCount), expectedVisibility);
            validateProductSizeVisibility(Integer.parseInt(expectedCount), expectedVisibility);
            validateProductBrandVisibility(Integer.parseInt(expectedCount), expectedVisibility);
            validateProductEstDateVisibility(Integer.parseInt(expectedCount), expectedVisibility);
            scenarioDef.log(Status.PASS, "Validated All Attributes are Displayed on Cart");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Validate All Attributes are Displayed on Cart");
            throw e;
        }
    }
}