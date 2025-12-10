import transformAllWindows from '../transformAllWindows';

jest.dontMock('object-assign');

describe('ModalWindow: transformAllWindows', () => {
  const inputTree = {
    component: 'component1',
    childs: {
      component1_1: {
        component: 'component1_1',
        childs: {
          component1_1_1: {
            component: 'component1_1_1'
          },
          component1_1_2: {
            component: 'component1_1_2'
          }
        }
      },
      component1_2: {
        component: 'component1_2',
        childs: {
          component1_1_1: {
            component: 'component1_2_1'
          },
          component1_1_2: {
            component: 'component1_2_2'
          }
        }
      }
    }
  };
  const inputTree_copy = {
    component: 'component1',
    childs: {
      component1_1: {
        component: 'component1_1',
        childs: {
          component1_1_1: {
            component: 'component1_1_1'
          },
          component1_1_2: {
            component: 'component1_1_2'
          }
        }
      },
      component1_2: {
        component: 'component1_2',
        childs: {
          component1_1_1: {
            component: 'component1_2_1'
          },
          component1_1_2: {
            component: 'component1_2_2'
          }
        }
      }
    }
  };
  const testOutputTree = transformAllWindows(inputTree);
  console.log(inputTree);
  it('#1', () => {
    expect(testOutputTree).not.toEqual(inputTree);
  });
  it('#1', () => {
    expect(inputTree).toEqual(inputTree_copy);
  });
});
